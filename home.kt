// Define a sealed class named 'Result'
sealed class Result {
    // Define a data class 'Success' as a subclass of 'Result'
    data class Success(val data: String) : Result()
    
    // Define a data class 'Error' as a subclass of 'Result'
    data class Error(val message: String) : Result()
}

// Function to process a 'Result' object
fun processResult(result: Result) {
    // Use a 'when' expression to handle different cases of 'Result'
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
    }
}
