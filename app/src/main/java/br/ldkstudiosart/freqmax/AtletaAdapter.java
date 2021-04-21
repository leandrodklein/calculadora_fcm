package br.ldkstudiosart.freqmax;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AtletaAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Atleta> atletas;

    AtletaAdapter(List<Atleta> atletas, Context ctx) {
        this.atletas = atletas;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return atletas.size();
    }

    @Override
    public Object getItem(int position) {
        return atletas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = inflater.inflate(R.layout.atleta_item, null);
        TextView txtNome = v.findViewById(R.id.txtNomeItem);
        TextView txtIdade = v.findViewById(R.id.txtIdadeItem);

        Atleta a = atletas.get(position);
        txtNome.setText(a.getNome());
        txtIdade.setText(a.getIdade());
        return v;
    }
}
