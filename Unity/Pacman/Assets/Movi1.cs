using UnityEngine;
using System.Collections;

public class Movi1 : MonoBehaviour {


	// Use this for initialization
	void Start () {

	}

	// Update is called once per frame
	void Update () {
		if(Input.GetKey(KeyCode.UpArrow)){
			transform.Translate(0, 0, (Time.deltaTime * 10));
		}
		if(Input.GetKey(KeyCode.DownArrow)){
			transform.Translate(0, 0, -(Time.deltaTime * 10));
		}
		if(Input.GetKey(KeyCode.LeftArrow)){
			transform.Translate(-(Time.deltaTime * 10), 0, 0);
		}
		if(Input.GetKey(KeyCode.RightArrow)){
			transform.Translate((Time.deltaTime * 10), 0, 0);
		}
	}
}
