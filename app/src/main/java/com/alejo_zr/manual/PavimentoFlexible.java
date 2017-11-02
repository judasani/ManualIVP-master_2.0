package com.alejo_zr.manual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PavimentoFlexible extends AppCompatActivity {

    ArrayList<Daño> daños;
    private RecyclerView listaDaños;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavimento_flexible);

        listaDaños = (RecyclerView) findViewById(R.id.rvDaño);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaDaños.setLayoutManager(llm);
        inicializarListaDañoFlex();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        DañoAdaptador adaptador = new DañoAdaptador(daños, this);
        listaDaños.setAdapter(adaptador);
    }


    public void inicializarListaDañoFlex(){

        daños = new ArrayList<Daño>();

        daños.add(new Daño(1,1,R.drawable.fisura_long_trans, getString(R.string.fisuras_long_transversales), getString(R.string.fisuras_fl_lt)));
        daños.add(new Daño(1,2,R.drawable.fisura_construccion,getString(R.string.fisura_construccion), getString(R.string.fisura_fcl)));
        daños.add(new Daño(1,3,R.drawable.mario,getString(R.string.fisura_reflexion), getString(R.string.fisura_fjl)));
        daños.add(new Daño(1,4,R.drawable.mario,getString(R.string.fisura_medialuna), getString(R.string.fisura_fml)));
        daños.add(new Daño(1,5,R.drawable.mario,getString(R.string.fisura_borde), getString(R.string.fbd)));
        daños.add(new Daño(1,6,R.drawable.mario,getString(R.string.fisura_bloque), getString(R.string.fisura_fb)));
        daños.add(new Daño(1,7,R.drawable.mario,getString(R.string.piel_cocodrilo), getString(R.string.pc)));
        daños.add(new Daño(1,8,R.drawable.mario,getString(R.string.fisura_desplazamiento), getString(R.string.fdc)));
        daños.add(new Daño(1,9,R.drawable.mario,getString(R.string.fisura_incipiente), getString(R.string.fin)));
        daños.add(new Daño(1,10,R.drawable.mario,getString(R.string.ondulacion), getString(R.string.ond)));
        daños.add(new Daño(1,11,R.drawable.mario,getString(R.string.abultamiento), getString(R.string.ab)));
        daños.add(new Daño(1,12,R.drawable.mario,getString(R.string.hundimiento), getString(R.string.hun)));
        daños.add(new Daño(1,13,R.drawable.mario,getString(R.string.ahuellamiento), getString(R.string.ahu)));
        daños.add(new Daño(1,14,R.drawable.mario,getString(R.string.descascaramientof), getString(R.string.dcf)));
        daños.add(new Daño(1,15,R.drawable.mario,getString(R.string.bachesf), getString(R.string.bchf)));
        daños.add(new Daño(1,16,R.drawable.mario,getString(R.string.parche), getString(R.string.pch)));
        daños.add(new Daño(1,17,R.drawable.mario,getString(R.string.desgaste_superficial), getString(R.string.dsu)));
        daños.add(new Daño(1,18,R.drawable.mario,getString(R.string.perdida_agregado), getString(R.string.pa)));
        daños.add(new Daño(1,19,R.drawable.mario,getString(R.string.pulimentof_agregado), getString(R.string.puf)));
        daños.add(new Daño(1,20,R.drawable.mario,getString(R.string.cabeza_dura), getString(R.string.cd)));
        daños.add(new Daño(1,21,R.drawable.mario,getString(R.string.exudacion), getString(R.string.ex)));
        daños.add(new Daño(1,22,R.drawable.mario,getString(R.string.surcos), getString(R.string.su)));
        daños.add(new Daño(1,23,R.drawable.mario,getString(R.string.corrimiento_berma), getString(R.string.cvb)));
        daños.add(new Daño(1,24,R.drawable.mario,getString(R.string.separación_bermaf), getString(R.string.sbf)));
        daños.add(new Daño(1,25,R.drawable.mario,getString(R.string.afloramiento_finos), getString(R.string.afi)));
        daños.add(new Daño(1,26,R.drawable.mario,getString(R.string.afloramiento_agua), getString(R.string.afa)));

    }



}
