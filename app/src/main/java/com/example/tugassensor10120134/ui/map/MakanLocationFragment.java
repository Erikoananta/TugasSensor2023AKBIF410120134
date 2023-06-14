package com.example.tugassensor10120134.ui.map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.example.tugassensor10120134.R;

/*
Nama    : Eriko Ananta
NIM     : 10120134
Kelas   : IF-4
Matkul  : Aplikasi Komputer Bergerak
*/

public class MakanLocationFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            // Tambahkan marker untuk lokasi pertama
            LatLng lokasi1 = new LatLng(-6.8865394053401765, 107.61502130644679);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi1)
                    .title("Ayam SPG")
                    .snippet("Ayam SPG"));

            // Tambahkan marker untuk lokasi kedua
            LatLng lokasi2 = new LatLng(-6.886989428183924, 107.61487110275068);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi2)
                    .title("Warman")
                    .snippet("Warman"));

            // Tambahkan marker untuk lokasi ketiga
            LatLng lokasi3 = new LatLng(-6.887760942525793, 107.61515592082414);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi3)
                    .title("Richeese Factory Dipatiukur")
                    .snippet("Richeese Factory Dipatiukur"));

            // Tambahkan marker untuk lokasi keempat
            LatLng lokasi4 = new LatLng(-6.8881045779817835, 107.61470284400623);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi4)
                    .title("Kopi Payung Seduh")
                    .snippet("Kopi Payung Seduh"));

            // Tambahkan marker untuk lokasi kelima
            LatLng lokasi5 = new LatLng(-6.888080321277378, 107.61522946293788);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi5)
                    .title("Four C'S Cafe Eatery")
                    .snippet("Four C'S Cafe Eatery"));

            // Zoom ke lokasi pertama
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi1, 30));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_makan_location, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}