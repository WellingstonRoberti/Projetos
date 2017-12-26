using UnityEngine;
using System.Collections;

public class RespawnDoEscudo : MonoBehaviour {

	public GameObject Shield;
	public Transform lugardoShield;

	void Start () 
	{
		
	}

	// Update is called once per frame
	void Update () 
	{
		if(Tempo.tempo1 == 20)
			Instantiate (Shield, lugardoShield.position, lugardoShield.rotation);
	}
}
