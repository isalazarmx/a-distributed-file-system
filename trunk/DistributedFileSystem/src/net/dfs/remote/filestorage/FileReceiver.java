/**
 * Copyright 2008 Rukshan Silva
 *  
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations 
 * under the License.
 */

package net.dfs.remote.filestorage;

/**
 * StoreFile Interface Connects to the Space
 * and get the Files and Stores them in the 
 * remote storage
 * 
 * @author Rukshan Silva
 */
public interface FileReceiver {
	
	/**
	 * connectJavaSpace() connects to the Space
	 */
	public void connectJavaSpace();
	
	/**
	 * storeFile() Stores the file in the remote storage
	 */
	public void retrieveFile();
}
