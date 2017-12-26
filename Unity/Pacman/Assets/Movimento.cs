using UnityEngine;
using System.Collections;

public class Movimento : MonoBehaviour {
	
	public Texture[] pac1;
	int pacUM = 0;
	// Use this for initialization
	void Start () {

	}
	// Update is called once per frame
	void Update () {
		
		if(Input.GetKey(KeyCode.UpArrow)){
			transform.eulerAngles = new Vector3(0, 0, 0);
			pacUM++;
			pacUM %= pac1.Length;
			GetComponent<Renderer>().material.mainTexture = pac1 [pacUM];
		}
		if(Input.GetKey(KeyCode.DownArrow)){
			transform.eulerAngles = new Vector3 (0, 180, 0); 
			pacUM++;
			pacUM %= pac1.Length;
			GetComponent<Renderer>().material.mainTexture = pac1 [pacUM];
		}
		if(Input.GetKey(KeyCode.LeftArrow)){
			transform.eulerAngles = new Vector3 (0, -90, 0);
			pacUM++;
			pacUM %= pac1.Length;
			GetComponent<Renderer>().material.mainTexture = pac1 [pacUM];
		}
		if(Input.GetKey(KeyCode.RightArrow)){
			transform.eulerAngles = new Vector3 (0, 90, 0);
			pacUM++;
			pacUM %= pac1.Length;
			GetComponent<Renderer>().material.mainTexture = pac1 [pacUM];
		}

	}
}
