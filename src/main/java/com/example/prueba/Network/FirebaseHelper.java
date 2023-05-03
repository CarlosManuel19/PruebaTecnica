package com.example.prueba.Network;
import com.example.prueba.Model.Configuracion;
import com.example.prueba.Model.Venta;
import com.example.prueba.Model.VentaD;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

public class FirebaseHelper {

    private static final String TAG = FirebaseHelper.class.getSimpleName();

    private FirebaseDatabase database;
    private DatabaseReference configRef;

    public FirebaseHelper() {
        database = FirebaseDatabase.getInstance();
        configRef = database.getReference("configuracion");
    }

    public void getConfiguracion(ValueEventListener listener) {
        configRef.addValueEventListener(listener);
    }

    public void updateConsecutivo(String ruta, int consecutivo) {
        configRef.child(ruta).child("consecutivo").setValue(consecutivo);
    }

}



