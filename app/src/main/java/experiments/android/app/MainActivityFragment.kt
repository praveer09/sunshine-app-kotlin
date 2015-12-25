package experiments.android.app

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


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

        val forecastAdapter = ArrayAdapter<String>(activity, R.layout.list_item_forecast,
                R.id.forecastListItemTextView, weekForecast)

        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        val forecastListView = rootView.findViewById(R.id.forecastListView) as ListView
        forecastListView.adapter = forecastAdapter

        return rootView
    }
}
