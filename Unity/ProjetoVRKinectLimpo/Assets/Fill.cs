using UnityEngine;
using System.Collections;
using UnityEngine.UI;

public class Fill : MonoBehaviour {
	Image image;
	bool cd;
	// Use this for initialization
	void Start () {
		image = GetComponent<Image> ();
	}
	public void fill(){
		cd = true;
	}
	public void desfill(){
		cd = false;
		image.fillAmount = 0f;
	}
	// Update is called once per frame
	void Update () {
		if(cd)
			image.fillAmount += 0.33f * Time.deltaTime;
	}
}
