package achraf.tp_gpt_chat

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAIApi {
    @Headers("Content-type: application/json", "Authorization: Bearer sk-proj-d6N4b5f8CGuNGqckFAeNT3BlbkFJxwc0b3dPhJfQFga5p6qO")
    @POST("v1/chat/completions")
    suspend fun generateResponse(@Body requestBody: OpenAIRequestBody): OpenAIResponse
}


data class OpenAIRequestBody(
    val model: String = "gpt-3.5-turbo",
    val messages: List<Message>,
    val max_tokens: Int = 50,
    val n: Int = 1,
    val temperature: Double = 1.0
)

data class OpenAIResponse(
    val choices: List<MessageResponse>
)

data class MessageResponse(
    val message: Message
)

