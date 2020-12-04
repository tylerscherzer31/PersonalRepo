using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class UIManager : MonoBehaviour
{
    public GameObject pauseScreen;

    void Start()
    {
        
    }

    void Update()
    {
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
