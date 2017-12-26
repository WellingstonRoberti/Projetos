using UnityEngine;
using System.Collections;

public class Movimento : MonoBehaviour {
	

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
		if(Input.GetKey(KeyCode.UpArrow)){
			transform.Translate(0, 0, (Time.deltaTime * 10));
			if (transform.position.z > 11) {
				transform.position = new Vector3(transform.position.x, transform.position.y, 11);
			}
		}
		if(Input.GetKey(KeyCode.DownArrow)){
			transform.Translate(0, 0, -(Time.deltaTime * 10));
			if (transform.position.z < -8.99f) {
				transform.position = new Vector3(transform.position.x, transform.position.y, -8.99f);
			}
		}
		if(Input.GetKey(KeyCode.LeftArrow)){
			transform.Translate(-(Time.deltaTime * 10), 0, 0);
			if (transform.position.x < -17f) {
				transform.position = new Vector3(-17f, transform.position.y, transform.position.z);
			}
		}
		if(Input.GetKey(KeyCode.RightArrow)){
			transform.Translate((Time.deltaTime * 10), 0, 0);
			if (transform.position.x > 13.8f) {
				transform.position = new Vector3(13.8f, transform.position.y, transform.position.z);
			}
		}

	}
}
