package org.example.proyectofinal.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import org.example.proyectofinal.registroOrganizador;

@Database(entities = {registroOrganizador.class}, version = 1)
public abstract class organiadorDatabase extends RoomDatabase {

}
