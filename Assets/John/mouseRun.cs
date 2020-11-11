using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class mouseRun : MonoBehaviour
{
    private Animator m_animator;
    // Start is called before the first frame update
    void Start()
    {
        m_animator = GetComponent<Animator>();
        m_animator.SetInteger("AnimIndex", 1);
        m_animator.SetTrigger("Next");
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
