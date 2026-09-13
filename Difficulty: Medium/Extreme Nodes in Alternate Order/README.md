<h2><a href="https://www.geeksforgeeks.org/problems/extreme-nodes-in-alternate-order/1">Extreme Nodes in Alternate Order</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given the <strong>root</strong> of a binary tree, return a list containing the <strong>alternating</strong> extreme nodes at each level, starting with the rightmost node at the first level. </span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [1, 2, 3, 4, 5, N, N, 7, N, N, N]<strong>
Output: </strong>[1, 2, 5, 7]
<strong>Explanation: </strong><strong><br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930034/Web/Other/blobid10_1782121756.png" width="221" height="196"><br></strong>The tree is traversed level by level.
Level 0 - Select right extreme - 1
Level 1 - Select left extreme - 2
Level 2 - Select right extreme - 5
Level 3 - Select left extreme - 7
At each level, we alternately choose the rightmost and leftmost node.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14]   <br><strong>Output:</strong> [20, 8, 12, 10]<br><strong>Explanation: <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930034/Web/Other/blobid11_1782121779.png" width="186" height="225"><br></strong>The tree is traversed level by level.
Level 0 – Select the right extreme - 20
Level 1 – Select the left extreme - 8
Level 2 – Nodes are [4, 12]; select the right extreme - 12
Level 3 – Nodes are [10, 14]; select the left extreme - 10
At each level, the selected extreme alternates between rightmost and leftmost.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>5</sup><br>1 ≤ node-&gt;data ≤ 5*10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;