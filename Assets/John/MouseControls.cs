using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MouseControls : MonoBehaviour
{
    public GameObject[] positions;
    public bool reset = true;
    public int positionIndex = 1;
    void Start()
    {
        transform.position = positions[positionIndex].transform.position;
    }

    // Update is called once per frame
    void Update()
    {
        print(Input.GetAxis("Horizontal"));
        if(Input.GetKeyDown(KeyCode.LeftArrow))
        {
            
                if (positionIndex - 1 > -1)
                {
                    positionIndex -= 1;
                    transform.position = positions[positionIndex].transform.position;
                    reset = false;

                }

            


        }
        else if(Input.GetKeyDown(KeyCode.RightArrow))
        {
            
                if (positionIndex + 1 < positions.Length)
                {
                    positionIndex += 1;
                    transform.position = positions[positionIndex].transform.position;
                    reset = false;

                }
            
            
                
            
        }
        else
        {
            reset = true;
        }
    }
}
