using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MainMenu : MonoBehaviour
{
    public void PlayGame()
    {
        GameState.mode = GameState.GameMode.idle;
        GameState.gameScore = 0f;
        GameState.level = 1;
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex + 1);
        
    }

    public void QuitGame()
    {
        Application.Quit();
    }

    public void PlayAgain()
    {
        GameState.mode = GameState.GameMode.idle;
        GameState.gameScore = 0f;
        GameState.level = 1;
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex - 1);
        
    }
}
