package com.facumediotte.intentImplicito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * @author fmediotte
 */
public class ThirdActivity extends AppCompatActivity {

    private EditText editTextPhone;
    private EditText editTextWeb;
    private ImageButton imgBtnPhone;
    private ImageButton imgBtnWeb;
    private ImageButton imgBtnCamera;

    private final int PHONE_CALL_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        editTextWeb = (EditText) findViewById(R.id.editTextWeb);
        imgBtnPhone = (ImageButton) findViewById(R.id.imageButtonPhone);
        imgBtnWeb = (ImageButton) findViewById(R.id.imageButtonWeb);
        imgBtnCamera = (ImageButton) findViewById(R.id.imageButtonCamera);

        imgBtnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editTextPhone.getText().toString();
                if(phoneNumber != null && !phoneNumber.isEmpty()){
                    // comprobar versión actual de android que estamos corriendo
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                        //Comprobar si ha aceptado, no ha aceptado, o nunca se le ha preguntado.
                        if(checkPermission(Manifest.permission.CALL_PHONE)) {
                            //Ha aceptado
                            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                            if(ActivityCompat.checkSelfPermission(ThirdActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                return;
                            }
                            startActivity(i);
                        } else {
                            // Ha denegado o es la primera vez que se le pregunta
                            if(shouldShowRequestPermissionRationale(Manifest.permission.CALL_PHONE)) {
                                // No se le ha preguntado aún
                                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);
                            } else {
                                // Ha denegado
                                Toast.makeText(ThirdActivity.this, "Please, enable the request permission", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                i.addCategory(Intent.CATEGORY_DEFAULT);
                                i.setData(Uri.parse("package:" + getPackageName()));
                                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS); // con este flag evito baches de seguridad
                                startActivity(i);
                            }
                        }

                    } else{
                        olderVersions(phoneNumber);
                    }
                } else {
                    Toast.makeText(ThirdActivity.this, "Enter a valid phone number", Toast.LENGTH_SHORT).show();
                }
            }

            private void olderVersions(String phoneNumber) {
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                if(checkPermission(Manifest.permission.CALL_PHONE)) {
                    startActivity(intentCall);
                } else {
                    Toast.makeText(ThirdActivity.this, "You decline the access", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //Estamos en el caso del telefono
        switch (requestCode) {
            case PHONE_CALL_CODE:
                String permission = permissions[0];
                int result = grantResults[0];

                if(permission.equals(Manifest.permission.CALL_PHONE)) {
                    //comprobar si ha sigo aceptado o denegado la petición de permiso
                    if(result == PackageManager.PERMISSION_GRANTED){
                        //Concedio su permiso
                        String phoneNumber = editTextPhone.getText().toString();
                        Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intentCall);
                    } else{
                        //No concedió su permiso
                        Toast.makeText(ThirdActivity.this, "You declined this access", Toast.LENGTH_SHORT).show();
                    }
                }

                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                break;
        }
    }

    private boolean checkPermission(String permission){
        int result = this.checkCallingOrSelfPermission(permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
