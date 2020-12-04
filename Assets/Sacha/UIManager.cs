using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class UIManager : MonoBehaviour
{
    public GameObject pauseScreen;
    public Text score;
   
    void Start()
    {
        
    }

    void Update()
    {
        GameState.gameScore += Time.deltaTime; 
        score.text = "Score: " + GameState.gameScore.ToString("F2") + " meters";

        if (Input.GetKeyDown(KeyCode.P))
        {
            pauseScreen.SetActive(true);
            Time.timeScale = 0f;
        }
    }

    public void Continue()
    {
        pauseScreen.SetActive(false);
        Time.timeScale = 1f;
    }

    public void Quit()
    {
        SceneManager.LoadScene(0);
    }
}
