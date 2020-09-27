package com.v.simpleplayer;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.v.simpleplayer.album.AlbumsFragment;
import com.v.simpleplayer.artist.ArtistsFragment;
import com.v.simpleplayer.folder.FilesFragment;
import com.v.simpleplayer.music.MusicFragment;
import com.v.simpleplayer.playlist.PlaylistFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.playlists:
                        selectedFragment = PlaylistFragment.newInstance();
                        break;
                    case R.id.music:
                        selectedFragment = MusicFragment.newInstance();
                        break;
                    case R.id.albums:
                        selectedFragment = AlbumsFragment.newInstance();
                        break;
                    case R.id.artists:
                        selectedFragment = ArtistsFragment.newInstance();
                        break;
                    case R.id.folders:
                        selectedFragment = FilesFragment.newInstance();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, selectedFragment).commit();
                return true;
            }
        });
        bottomNavigation.setSelectedItemId(R.id.music);
    }

}