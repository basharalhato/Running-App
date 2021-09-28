package dev.bhato.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.bhato.runningapp.repositories.MainRepository
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    private val mainRepository: MainRepository
): ViewModel(){
    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()

    val rusSortedByDate = mainRepository.getAllRunsSortedByDate()
}