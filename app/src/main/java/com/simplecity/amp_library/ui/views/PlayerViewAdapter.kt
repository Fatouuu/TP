package com.simplecity.amp_library.ui.views

import com.simplecity.amp_library.model.Playlist
import com.simplecity.amp_library.model.Song
import com.simplecity.amp_library.ui.screens.nowplaying.PlayerView

abstract class PlayerViewAdapter : PlayerView {

    override fun setSeekProgress(progress: Int) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun currentTimeVisibilityChanged(visible: Boolean) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun currentTimeChanged(seconds: Long) {
    // This function is empty because there is currently no need to update the last known stream position.
    // If there is a requirement in the future to track or update the stream position, the implementation
    // can be completed accordingly.
    }

    override fun totalTimeChanged(seconds: Long) {
    // This function is empty because there is currently no need to update the last known stream position.
    // If there is a requirement in the future to track or update the stream position, the implementation
    // can be completed accordingly.
    }

    override fun queueChanged(queuePosition: Int, queueLength: Int) {
    // This function is empty because there is currently no need to update the last known stream position.
    // If there is a requirement in the future to track or update the stream position, the implementation
    // can be completed accordingly.
    }

    override fun playbackChanged(isPlaying: Boolean) {
            // This function is empty because there is currently no need to update the last known stream position.
            // If there is a requirement in the future to track or update the stream position, the implementation
            // can be completed accordingly.
        }

    override fun shuffleChanged(shuffleMode: Int) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun repeatChanged(repeatMode: Int) {
            // This function is empty because there is currently no need to update the last known stream position.
            // If there is a requirement in the future to track or update the stream position, the implementation
            // can be completed accordingly.
    }

    override fun favoriteChanged(isFavorite: Boolean) {
            // This function is empty because there is currently no need to update the last known stream position.
            // If there is a requirement in the future to track or update the stream position, the implementation
            // can be completed accordingly.
    }

    override fun trackInfoChanged(song: Song?) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun showLyricsDialog() {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun showUpgradeDialog() {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun presentCreatePlaylistDialog(songs: List<Song>) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun presentSongInfoDialog(song: Song) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun onSongsAddedToPlaylist(playlist: Playlist, numSongs: Int) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun onSongsAddedToQueue(numSongs: Int) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun presentTagEditorDialog(song: Song) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun presentDeleteDialog(songs: List<Song>) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun shareSong(song: Song) {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun presentRingtonePermissionDialog() {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }

    override fun showRingtoneSetMessage() {
        // This function is empty because there is currently no need to update the last known stream position.
        // If there is a requirement in the future to track or update the stream position, the implementation
        // can be completed accordingly.
    }
}