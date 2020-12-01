using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GamePlay : MonoBehaviour
{
    public GameObject cat;
    public GameObject[] positions;
    public float time = 0f;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if(Time.time > time + 2)
        {
            time = Time.time;
            var rand = Random.Range(0, positions.Length);
            Instantiate(cat, positions[rand].transform.position, Quaternion.Euler(0,180,0));
        }
    }
}
