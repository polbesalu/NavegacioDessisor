package cat.institutmontilivi.navegaciogood.ui.theme.Navegacio

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cat.institutmontilivi.navegaciogood.ui.theme.Pantalles.PantallaCaraOCreu
import cat.institutmontilivi.navegaciogood.ui.theme.Pantalles.PantallaNumeros
import cat.institutmontilivi.navegaciogood.ui.theme.Pantalles.PreviewPantallaPrincipal


@Composable
fun Navegacio()
{
    //Creem el navegador

    val contraldorDeNavegacio =  rememberNavController()

    NavHost(navController = contraldorDeNavegacio,
        startDestination = ElementDeNavegacio.Principal.rutaBase)
    {
        composable(ElementDeNavegacio.Principal.rutaSencera){
            PreviewPantallaPrincipal(onNavegaMoneda = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Moneda.rutaSencera)},
                onNavegaNumeros = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Numeros.rutaSencera)},
                onNavegaOracle = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Oracle.rutaSencera)})
        }
        composable(ElementDeNavegacio.Moneda.rutaSencera){
            PantallaCaraOCreu(onResultadoClick = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Moneda.rutaSencera)},
                { contraldorDeNavegacio.navigate(ElementDeNavegacio.Principal.rutaSencera) })
        }
        //composable(ElementDeNavegacio.Numeros.rutaSencera){
           //PantallaNumerosRandom(minim = minim, maxim = maxim+1,
            //    onNavegaInici = {controladorDeNavegacio.navigate(ElementDeNavegacio.Principal.rutaSencera)}
            //)
        //PantallaNumeros()}
        //}
        composable(
            route = ElementDeNavegacio.Oracle.rutaSencera,
            arguments = listOf(
                //navArgument(ElementDeNavegacio.Contingut.argumentsDeNavegacio[0].clau) {type= NavType.StringType}
            )
        ){
            //val text=it.arguments?.getString(ElementDeNavegacio.Contingut.argumentsDeNavegacio[0].clau)
            //requireNotNull(text,{"Error el text no pot ser null"})
            //Pantallaelement(text=text)
        }

    }

}

