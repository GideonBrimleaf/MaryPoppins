import io.javalin.Javalin
import models.Wrestler
import org.slf4j.LoggerFactory

fun main(){
    val log = LoggerFactory.getLogger("mary-poppins.main")

    val portEnv = System.getenv("PORT")
    val actualPort = portEnv?.toInt() ?:7000

    val app = Javalin.create {
        it.addStaticFiles("/public")
    }.start(actualPort)

    log.info("app started on port $actualPort");

    app.routes {
        app.get("/") { ctx ->
            val mary = Wrestler("Mary Poppins", 40, "Swanton Bomb")
            ctx.render("templates/index.peb", mapOf("message" to mary.yell()))
        }
        app.get("/speak-chewie") { ctx -> ctx.render("templates/speakChewie.peb") }
        app.get("/textie") { ctx -> ctx.result("I'm Mary Poppins Y'All!") }
        app.get("/jsonarama") { ctx -> ctx.json(mapOf("data" to "I'm Mary Poppins Y'All")) }
    }
}