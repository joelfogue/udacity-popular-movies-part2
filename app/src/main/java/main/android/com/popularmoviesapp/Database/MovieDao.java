package main.android.com.popularmoviesapp.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM movie ORDER BY movie_title ASC")
    List<Movie> loadAllMovies();
    @Insert
    void insertMovie(Movie movie);
    @Update
    void updateMovie(Movie movie);
    @Delete
    void deleteMovie(Movie movie);
}
