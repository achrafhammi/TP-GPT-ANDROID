package achraf.tp_gpt_chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import achraf.tp_gpt_chat.ui.theme.TPGPTCHATTheme
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TPGPTCHATTheme {
                    val chatViewModel = viewModel<ChatViewModel>()
                    ChatScreen(viewModel = chatViewModel)
            }
        }
    }
}
