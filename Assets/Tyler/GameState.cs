using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameState : MonoBehaviour
{
    public enum GameMode
    {
        idle,
        playing,
        dead,
        levelEnd,
        end
    }

    public static int numLives = 3;
    public static GameMode mode = GameMode.idle;

}

