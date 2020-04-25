package backup.config

import config.Configuration
import java.util.*


class ConfigurationProvider {

    private lateinit var configuration: Configuration

    constructor() {
        val prop = Properties()
        val config = javaClass.getResourceAsStream("configuration.properties")
        prop.load(config)
    }

    fun get() = configuration

}