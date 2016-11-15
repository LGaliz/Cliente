package ar.edu.unsam.poiapp.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import ar.edu.unsam.poiapp.R;
import ar.edu.unsam.poiapp.domain.Poi;

/**
 * Created by Cristian on 15/11/2016.
 */

public class ColectivoAdapter {

    public View getView(View rootView, Poi poi) {

        ((TextView) rootView.findViewById(R.id.direccion)).setText("Dirección: \n" + poi.getDireccion()  + "\n");
        ((TextView) rootView.findViewById(R.id.calificacionGeneral)).setText("Calificación General: " + poi.getCalificacion() + "\n" );
        ((TextView) rootView.findViewById(R.id.calificacion)).setText("Review: \n" + poi.getReviews());
        //((TextView) rootView.findViewById(R.id.servicio)).setText("Servicio: \n" + poi.getDireccion());


        return rootView;
    }
}
