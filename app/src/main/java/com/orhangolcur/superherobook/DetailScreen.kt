import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.orhangolcur.superherobook.Superhero

@Composable
fun DetailScreen(superhero: Superhero) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = superhero.name,
                modifier = Modifier.padding(2.dp),
                style = MaterialTheme.typography.displayLarge,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center)

            Image(bitmap = ImageBitmap.imageResource(id = superhero.image),
                contentDescription = superhero.name,
                modifier = Modifier
                    .padding(16.dp)
                    .size(300.dp, 300.dp)
            )

            Text(text = superhero.universe,
                modifier = Modifier.padding(2.dp),
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                textAlign = TextAlign.Center)
        }
    }
}