# Lumina

> Offline-first micro-learning for Android: hijacking the infinite-scroll mechanic to feed curiosity instead of brain rot.

![Build](https://github.com/eya-gassab/lumina-android/actions/workflows/android-ci.yml/badge.svg)
![Platform](https://img.shields.io/badge/platform-Android%208.1%2B-green)
![Status](https://img.shields.io/badge/status-work%20in%20progress-orange)

![Lumina demo](docs/media/swipe.gif)

## Vision
Vertical-scroll interfaces exploit dopamine loops and erode focus. Lumina reuses the same
low-friction gesture to deliver one mental model per card (e.g. Pareto principle, Occam's razor):
a concept, a TL;DR and a practical application, in a calm editorial design.

## Design principles
- **Zero-latency reading**: no network call while scrolling; content is read locally.
- **Invisible UI**: gestures over buttons (swipe up to read on, double-tap to save).
- **Editorial aesthetic**: serif typography on a cream / espresso palette.

## Architecture (target)
| Layer | Tech | Role |
|---|---|---|
| UI | Java, ViewPager2, RecyclerView | Full-screen vertical card feed, custom PageTransformer |
| Local data | Room (SQLite) | Instant offline reads, bookmarks |
| Sync | WorkManager, Retrofit | Silent daily background download |
| Content factory | FastAPI, LangGraph | Researcher → Writer → Editor agents generate and validate concepts nightly |

Details in [docs/ARCHITECTURE.md](docs/ARCHITECTURE.md).

## Roadmap
- [x] design system, card layout, vertical ViewPager2, scale transformer (mock data)
- [ ] LangGraph content factory, FastAPI endpoint, Room + Retrofit + WorkManager sync
- [ ] bookmarks library, haptic feedback, UI polish, profiling, release APK

## Current status
Week 1 complete: the swipe experience runs on **mock data**. The AI pipeline and sync layer are in development.

## Run locally
1. Clone the repo, open it in Android Studio (JDK 17).
2. Run on an emulator or device (minSdk 27).

## Author
Eya Gassab, Software Engineering student, Faculty of Sciences of Monastir
[GitHub](https://github.com/eya-gassab)
