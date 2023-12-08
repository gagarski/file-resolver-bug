package ski.gagar.frb

import io.vertx.core.file.impl.FileResolverImpl

fun main() {
    val resolver = FileResolverImpl()
    resolver.resolveFile("test.txt")
    println("All good")
}