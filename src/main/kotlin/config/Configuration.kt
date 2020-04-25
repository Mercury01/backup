package config

import java.io.File
import java.util.*

data class Configuration(
    val sourceFolder: File,
    val destinationURL: String
)

fun Properties.toConfiguration() =
    Configuration(
        File(getProperty("source.folder")),
        getProperty("destination.url")
    )