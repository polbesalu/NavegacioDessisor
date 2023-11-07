package cat.institutmontilivi.navegaciogood.ui.theme.Navegacio

import androidx.navigation.NavType
import org.w3c.dom.Text

sealed class ElementDeNavegacio(
    val rutaBase: String,
    val argumentsDeNavegacio: List<ArgumentDeNavegacio> = emptyList(),
    val rutaSencera: String = run{
        // rutaBase/{arg}/{arg2}/.../{argN}
        val clausArguments = argumentsDeNavegacio.map {
            "{${it.clau}}"}
        listOf(rutaBase)
            .plus(clausArguments)
            .joinToString(separator = "/")
    }
)
{
    object Principal: ElementDeNavegacio("principal")
    object Numeros: ElementDeNavegacio("numeros")
    object Lletres: ElementDeNavegacio("lletres")
    object Contingut: ElementDeNavegacio("contingut",listOf(ArgumentDeNavegacio.Text))
    {
        fun CreaRutaDeNavegacio (element: Int) =
            "$rutaBase/${element.toString()}"

        fun CreaRutaDeNavegacio (element: Char) =
            "$rutaBase/${element}"

    }
}

enum class ArgumentDeNavegacio(
    val clau: String,
    val tipus: NavType<*>
)
{
    Text(
        clau = "text",
        tipus = NavType.StringType
    ),
    Pagina (clau = "plana", tipus = NavType.IntType),
    Audio (clau = "audioOn", NavType.BoolType)
}