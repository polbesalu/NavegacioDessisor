package cat.institutmontilivi.navegaciogood.ui.theme.Pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreviewPantallaPrincipal(onNavegaMoneda: () -> Unit,
                             onNavegaNumeros: () -> Unit,
                             onNavegaOracle: () -> Unit){
    Scaffold (
        topBar ={
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Menu Principal")
                },
                navigationIcon= {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Pantalla Principal"
                        )


                    }
                }
            )
        },
    ){

        Column(
            modifier= Modifier
                .padding(it)
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                onNavegaMoneda()
                /*contraldorDeNavegacio.navigate("numeros")*/
            },
                modifier= Modifier
                    .fillMaxWidth()

            )
            {
                Text(text = "CARA O CREU",
                    style = MaterialTheme.typography.headlineLarge

                )

            }
            Spacer(modifier = Modifier.height(24.dp))
            var opcioInicial = ""
            var opcioSelect by remember {
                mutableStateOf(opcioInicial)
            }
            var minim by remember {mutableStateOf("0")}
            var maxim by remember {mutableStateOf("10")}
            Row(){
                TextField(value = minim,
                    onValueChange = {minim = it},
                    label = { Text("Minim")},
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    modifier = Modifier.weight(1f))

                TextField(value = maxim,
                    onValueChange = {maxim = it},
                    label = { Text("Maxim")},
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    modifier = Modifier.weight(1f))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = {
                onNavegaNumeros()
                /*contraldorDeNavegacio.navigate("lletres")*/
            },
                modifier= Modifier
                    .fillMaxWidth()

            )
            {
                Text(text = "NUMEROS",
                    style = MaterialTheme.typography.headlineLarge

                )

            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = {
                onNavegaOracle
                /*contraldorDeNavegacio.navigate("lletres")*/
            },
                modifier= Modifier
                    .fillMaxWidth()

            )
            {
                Text(text = "ORACLE",
                    style = MaterialTheme.typography.headlineLarge

                )

            }

        }

    }

}