package com.snadinao.catsapplication

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.snadinao.catsapplication.model.CatData
import com.snadinao.catsapplication.ui.theme.CatsApplicationTheme
import com.snadinao.catsapplication.uitel.CatCard
import com.snadinao.catsapplication.viewmodel.CatViewModel

class MainActivity : ComponentActivity() {

    private val catViewModel: CatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatsApplicationTheme {
                val catsLists = catViewModel.catsList.value
                SetCatsList(catsList = catsLists!!, context = this)

            }
        }
    }
}

@Composable
fun SetCatsList(catsList: List<CatData>, context: Context) {
    LazyColumn {
        itemsIndexed(items = catsList){ index, itemCats ->
            CatCard(catData = itemCats, onClick = {
                Toast.makeText(context, itemCats.catName, Toast.LENGTH_SHORT).show()
            })
        }
    }
}

@Preview
@Composable
fun SetCatsView() {

}