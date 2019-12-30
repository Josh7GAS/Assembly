using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FollowPlayerX : MonoBehaviour
{
    public GameObject plane;
    private Vector3 offset = new Vector3(30, 0, 10);
    private Vector3 cameraRotation = new Vector3(0, -90, 0);

    // Start is called before the first frame update
    void Start()
    {
   
}

    // Update is called once per frame
    void Update()
    {
        transform.position = plane.transform.position + offset;

        // Quaternion target = Quaternion.Euler(cameraRotation);

        //transform.rotation = Quaternion.Slerp(plane.transform.rotation, target, 0);
    }
}