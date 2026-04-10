EIWkNN – Enhanced Improved Weighted k-Nearest Neighbor

A sentiment analysis system using feature–opinion extraction and weighted KNN.

Modules Overview
1. eiwknn – Sentiment Classification Using 5-Nearest Neighbors

This module performs sentiment classification by applying the Enhanced Improved Weighted k-Nearest Neighbor algorithm.
It uses k = 5 neighbors to determine the final sentiment polarity.

2. excel – Connect Database Through Excel

This module connects the system to a database using Excel.
It allows importing, exporting, and updating opinion/feature datasets through Excel files.

3. fff – Eliminate Repeated Opinion Words

This module removes duplicate opinion words from the collected dataset to ensure clean and non-redundant opinion lists.

4. findopi – Extract Opinion Words

This module scans a text file and identifies all opinion words present in the text.

5. map – Feature-Contained Sentence Detection

This module identifies sentences that contain specific product features, helping link text segments to relevant features.

6. mapopi – Map Opinion Words to Feature Sentences

This module maps extracted opinion words to their corresponding feature-containing sentences, establishing feature–opinion pairs.
