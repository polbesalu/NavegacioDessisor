package cat.institutmontilivi.navegaciogood.ui.theme.Pantalles

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import cat.institutmontilivi.navegaciogood.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaCaraOCreu(onResultadoClick: (Boolean) -> Unit, onNavegaInici: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("CARA O CREU")
                },
                navigationIcon = {
                    IconButton(onClick = { onNavegaInici }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Pantalla Principal"
                        )
                    }
                }
            )
        }
    ) {
        CaraOCreu(it,onResultadoClick)
    }
}


@Composable
fun CaraOCreu(paddingValues: PaddingValues, onResultatClick: (Boolean) -> Unit) {
    val opcions = listOf(true, false) // true: cara, false: creu
    var opcioInicial = ""

    var opcioSelect by remember {
        mutableStateOf(opcioInicial)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        Text(
            text = "Tira la moneda",
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.secondary),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onSecondary
        )
        Image(
            painter = painterResource(id = R.drawable.bombboclat),
            contentDescription = null,
            modifier = Modifier
                .width(56.dp)
                .scale(1F)
                .padding(4.dp)
                .clip(shape = CircleShape)
                .align(Alignment.CenterHorizontally)
        )
        Button(onClick = {
            val randomValue = (0..1).random()
            val heads = 1
            val tails = 0
            if (randomValue == 1)
                opcioSelect = "Cara has guanyat!"
            else
                opcioSelect = "Creu has perdut..."
        }) {
            Text(text = "PREM PER TIRAR!")
        }
        Text(text = opcioSelect)
    }
}