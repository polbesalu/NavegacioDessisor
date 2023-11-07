package cat.institutmontilivi.navegaciogood.ui.theme.Navegacio

/*import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun Navegacio()
{
    //Creem el navegador

    val contraldorDeNavegacio =  rememberNavController()

    NavHost(navController = contraldorDeNavegacio,
        startDestination = ElementDeNavegacio.Principal.rutaBase)
    {
        composable(ElementDeNavegacio.Principal.rutaSencera){
            PantallaPrincipal(onNavegaLletres = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Lletres.rutaSencera)},
                onNavegaNumeros = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Numeros.rutaSencera)})
        }
        composable(ElementDeNavegacio.Numeros.rutaSencera){
            PantallaNumeros(onNumeroClick = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Contingut.CreaRutaDeNavegacio(it))})
        }
        composable(ElementDeNavegacio.Lletres.rutaSencera){
            PantallaLletres(onLletraClick = {contraldorDeNavegacio.navigate(ElementDeNavegacio.Contingut.CreaRutaDeNavegacio(it))})
        }
        composable(
            route = ElementDeNavegacio.Contingut.rutaSencera,
            arguments = listOf(
                navArgument(ElementDeNavegacio.Contingut.argumentsDeNavegacio[0].clau) {type= NavType.StringType}
            )
        ){
            val text=it.arguments?.getString(ElementDeNavegacio.Contingut.argumentsDeNavegacio[0].clau)
            requireNotNull(text,{"Error el text no pot ser null"})
            Pantallaelement(text=text)
        }

    }

}

*/