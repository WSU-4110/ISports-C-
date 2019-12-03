package com.First.ISportsC.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.First.ISportsC.ui.LocationModel;
import com.First.ISportsC.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<LocationModel> modellist;
    ArrayList<LocationModel> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<LocationModel> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<LocationModel>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Basketball")){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNRJf0eKFiW6VsOr8Es19PDvHEPiOg%3A1574192598944&source=hp&ei=1kXUXe2UNte5-wSv8bSYCQ&q=play+basketball+near+me&oq=play+basketball+near+me&gs_l=psy-ab.3..0j0i22i30l9.1763.1763..2394...0.0..0.139.139.0j1......0....2j1..gws-wiz.VXe9h1nBXQc&ved=0ahUKEwjt16i1hPflAhXX3J4KHa84DZMQ4dUDCAc&uact=5"));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Soccer")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNTgYBFbmKCQuYzX8kPFf00rg_3AVQ%3A1574192602026&ei=2kXUXZ2bAcj3-gS-_73wCA&q=play+soccer+near+me&oq=play+soccer+near+me&gs_l=psy-ab.3..0j0i7i30j0i5i30l6j0i7i5i30l2.302128.304978..305666...0.2..0.408.2483.0j15j4-1......0....1..gws-wiz.......0i71j35i304i39j0i273.0qhxvxqMldo&ved=0ahUKEwid8Oe2hPflAhXIu54KHb5_D44Q4dUDCAo&uact=5"));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Bowling")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNRod7WZ3izOT8f7xmRbAB9K75R9xQ%3A1574193010328&ei=ckfUXfTCE8PV-gT-3ILABA&q=+bowling+near+me&oq=+bowling+near+me&gs_l=psy-ab.3..0i273l2j0i7i30j0l2j0i7i30l4j0.7186.7533..8569...0.2..0.274.694.0j3j1......0....1..gws-wiz.......0i71.oKKkCDQh5wo&ved=0ahUKEwj0w8D5hfflAhXDqp4KHX6uAEgQ4dUDCAo&uact=5"));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Hockey")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNQehUPWR4u7CLrwmmfFC2XryL8bdA%3A1574193156237&ei=BEjUXbiCDsrh-gTT8pPgAg&q=playhockey+near+me&oq=playhockey+near+me&gs_l=psy-ab.3..0i13j0i7i30l9.9847.10430..10673...0.2..0.315.597.0j2j0j1......0....1..gws-wiz.......0i71.H8uF0EkARJo&ved=0ahUKEwi4lIq_hvflAhXKsJ4KHVP5BCwQ4dUDCAo&uact=5"));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Football")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNSDnj-GSqU8HHW74mb4Zt_7y03x2Q%3A1574193168441&ei=EEjUXeXEGoPc-gSaqpjgAw&q=play+football+near+me&oq=play+football+near+me&gs_l=psy-ab.3..0j0i5i30l5j0i7i5i30j0i5i30l3.2388.78753..78924...1.2..0.312.1536.0j9j0j1......0....1..gws-wiz.......0i71j35i39j0i7i30j0i8i7i30j0i13j0i13i5i30j0i8i13i30.tFsCreVX2sk&ved=0ahUKEwjljPPEhvflAhUDrp4KHRoVBjwQ4dUDCAo&uact=5"));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Volleyball")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNS9BJZBtUjgWwit-1y_IRkkLxu_jQ%3A1574193323520&ei=q0jUXbCjH4Pk-gTHj6a4DQ&q=play+volleyball+near+me&oq=play+volleyball+near+me&gs_l=psy-ab.3...0.0..430...0.0..0.0.0.......0......gws-wiz.IWyT94KXjV8&ved=0ahUKEwjwpOyOh_flAhUDsp4KHceHCdcQ4dUDCAo&uact=5"));
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (LocationModel model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}