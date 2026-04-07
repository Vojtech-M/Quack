package cz.cvut.fel

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform