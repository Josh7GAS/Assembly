using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DestroyOutOffBound : MonoBehaviour
{
    private float topBound = 10f;
    private float lowerBound = -10f;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (transform.position.z > topBound)
        {
            //The "gameObjects" variable receive the passive object in the game
            Destroy(gameObject);
        }else if (transform.position.z < lowerBound)
        {
            Destroy(gameObject);
        }
    }
}
