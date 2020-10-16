package com.lorenagallas.tiendamascotas.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lorenagallas.tiendamascotas.Adaptador.MascotaAdaptador;
import com.lorenagallas.tiendamascotas.Mascota;
import com.lorenagallas.tiendamascotas.R;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecyclerViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyclerViewFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerViewMascota;
    private MascotaAdaptador adaptadorMascota;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecyclerViewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecyclerViewFragment newInstance(String param1, String param2) {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        recyclerViewMascota = v.findViewById(R.id.rvMascotas);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(getActivity()));

        adaptadorMascota = new MascotaAdaptador(obtenerMascotas());
        recyclerViewMascota.setAdapter(adaptadorMascota);
        // Inflate the layout for this fragment
        return v;
    }

    public ArrayList<Mascota> obtenerMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Manola", R.drawable.gato, 125));
        mascotas.add(new Mascota("Ibi", R.drawable.perro, 236));
        mascotas.add(new Mascota("Liam", R.drawable.pajaro, 23));
        mascotas.add(new Mascota("Nemo", R.drawable.pez, 198));
        mascotas.add(new Mascota("Anahi", R.drawable.paloma, 18));
        mascotas.add(new Mascota("Sabrina", R.drawable.mariposa, 112));
        mascotas.add(new Mascota("Karina", R.drawable.vaca, 98));
        mascotas.add(new Mascota("Ramiro", R.drawable.oveja, 9));
        mascotas.add(new Mascota("Mario", R.drawable.colibri, 325));

        return mascotas;
    }
}