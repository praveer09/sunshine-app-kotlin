package experiments.android.app

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainActivityFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val weekForecast = listOf(
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7")

        val forecastAdapter = ArrayAdapter<String>(activity,
                R.layout.list_item_forecast, R.id.forecastListItemTextView, weekForecast)

        return  inflater.inflate(R.layout.fragment_main, container, false).apply {
            forecastListView.adapter = forecastAdapter
        }
    }
}
