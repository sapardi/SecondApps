package im2.org.sample.second;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListMainApps extends ListActivity {
	TextView selection;
	
    @SuppressWarnings("unchecked")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
        setListAdapter(new ArrayAdapter(this, R.layout.list_item, R.id.label, WORLDCUP2010));
        TextView idEmpty = (TextView) findViewById(R.id.empty_content);
        getListView().setEmptyView(idEmpty);
        
        selection = (TextView) findViewById(R.id.selection);
        selection.setText("Select One: ");
        
//        getListView().setTextFilterEnabled(true); // karakter aphostrope, kutip atas
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	
    	String txt = String.format("Click me: %s", WORLDCUP2010[position]); // %s menampung worldcup ke variable S
    	Toast.makeText(this, txt, Toast.LENGTH_LONG).show();
    	
    	selection.setText("Your Choice: " + WORLDCUP2010[position]);
    }
    
    static final String[] WORLDCUP2010 = new String[] {
    	"Algeria", "Argentina", "Australia",
    	"Brazil", "Cote d'Ivoire", "Cameroon",
    	"Chile", "Costa Rica", "Denmark",
    	"England", "France", "Germany",
    	"Ghana", "Greece", "Honduras",
    	"Italy", "Japan", "Netherlands",
    	"New Zealand", "Nigeria", "North Korea",
    	"Paraguay", "Portugal", "Serbia",
    	"Slovakia", "Slovenia", "South Africa",
    	"South Korea", "Spain", "Switzerland",
    	"United State", "Uruguasy",
    };
}