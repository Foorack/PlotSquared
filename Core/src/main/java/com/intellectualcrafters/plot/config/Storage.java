package com.intellectualcrafters.plot.config;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Storage extends Config {

    public static String PREFIX = "";

    public static void save(File file) {
        save(file, Storage.class);
    }

    public static void load(File file) {
        load(file, Storage.class);
    }

    @Comment("MySQL section")
    public static final class MySQL {
        @Comment("Should MySQL be used?")
        public static boolean USE = false;
        public static String HOST = "localhost";
        public static String PORT = "3306";
        public static String USER = "root";
        public static String PASSWORD = "password";
        public static String DATABASE = "plot_db";

        @Comment("Set additional properties: https://goo.gl/wngtN8")
        public static List<String> PROPERTIES = new ArrayList<>(Collections.singletonList("useSSL=false"));
    }

    @Comment("SQLite section")
    public static final class SQLite {
        @Comment("Should SQLite be used?")
        public static boolean USE = true;
        @Comment("The file to use")
        public static String DB = "storage";
    }

    @Comment("MongoDB section")
    public static final class MongoDB {
        @Comment("Should MongoDB be used?")
        public static boolean USE = false;
        @Comment("If you are using a replica-set or multiple mongos then comma-separate both the hosts and the ports.")
        public static String HOST = "localhost";
        public static String PORT = "27017";
        @Comment("If you have not configured authentication then leave both username and password blank.")
        public static String USER = "";
        public static String PASSWORD = "";
        public static String DATABASE = "plot_db";
        public static boolean SSL = false;
    }

}
