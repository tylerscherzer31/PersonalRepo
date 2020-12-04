using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class UIManager : MonoBehaviour
{
    public GameObject pauseScreen;
    public Text score;
    public float scoreF = 0;
    void Start()
    {
        
    }

    void Update()
    {
        scoreF += Time.deltaTime; 
        score.text = "Score: " + scoreF.ToString("F2") + " meters";

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
