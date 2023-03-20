package com.jti.recycleviewfragment;

import java.util.ArrayList;

public class batikdata {
    private static  int[] batikimage ={
            R.drawable.parangkusumo,
            R.drawable.megamendung,
            R.drawable.sidomukti,
            R.drawable.tujuhrupa,
            R.drawable.keraton,
            R.drawable.lasem,
            R.drawable.singabarong,
            R.drawable.sekarjagad,
            R.drawable.pringsedapur,
            R.drawable.gentongan,
            R.drawable.sogan,
            R.drawable.simbut,
            R.drawable.kawung,
            R.drawable.geblkerenteng,
            R.drawable.tambal,
            R.drawable.jagatanpisang,
            R.drawable.ulamsarimas,
            R.drawable.toraja,
            R.drawable.asmat,
            R.drawable.kamoro,
            R.drawable.benangbintik,
            R.drawable.sairangan,
            R.drawable.nagabalimbur,
            R.drawable.tidayu,
            R.drawable.maluku,
            R.drawable.pecah,
            R.drawable.medan,
            R.drawable.minang,
            R.drawable.nelimbongan,
            R.drawable.sasambo
    };

    static ArrayList<batik> getListData(){
        ArrayList<batik> list  = new ArrayList<>();
        for(int position = 0; position<batikimage.length; position++){
            batik Batik = new batik();
            Batik.setPhoto(batikimage[position]);
            list.add(Batik);
        }
        return list;
    }
}
