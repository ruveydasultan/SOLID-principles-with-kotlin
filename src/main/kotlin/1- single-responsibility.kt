// BAD

data class User1(
    var id: Long,
    var name: String,
    var password: String
){
    fun signIn(){
        // This method will do signing in operations
    }

    fun signOut(){
        // This method will do signing out operations
    }
}
//BETTER
data class User2(
    var id: Long,
    var name: String,
    var password: String
)

class AuthenticationService(){
    fun signIn(){
        // This method will do signing in operations
    }

    fun signOut(){
        // This method will do signing out operations
    }
}
